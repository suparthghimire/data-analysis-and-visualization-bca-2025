package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IrisScatterPlot {
    // Data structures to store Iris data
    private List<Double> sepalLengths = new ArrayList<>();
    private List<Double> sepalWidths = new ArrayList<>();
    private List<Double> petalLengths = new ArrayList<>();
    private List<Double> petalWidths = new ArrayList<>();
    private List<String> species = new ArrayList<>();
    private Map<String, List<Double>> speciesSepalLengths = new HashMap<>();

    public void readIrisData(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            // Skip header
            reader.readNext();
            String[] line;
            while ((line = reader.readNext()) != null) {
                double sepalLength = Double.parseDouble(line[1]); // Column 1 is sepal length
                double sepalWidth = Double.parseDouble(line[2]); // Column 2 is sepal width
                double petalLength = Double.parseDouble(line[3]); // Column 3 is petal length
                double petalWidth = Double.parseDouble(line[4]); // Column 4 is petal width
                String specie = line[5]; // Column 5 is species

                sepalLengths.add(sepalLength);
                sepalWidths.add(sepalWidth);
                petalLengths.add(petalLength);
                petalWidths.add(petalWidth);
                species.add(specie);

                // Group sepal lengths by species
                speciesSepalLengths.computeIfAbsent(specie, k -> new ArrayList<>()).add(sepalLength);
            }
        } catch (IOException | CsvValidationException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading CSV file: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Scatter Plot: Sepal Length vs. Petal Length
    public JFreeChart createScatterPlot() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Map<String, XYSeries> seriesMap = new HashMap<>();

        // Create series for each species
        for (int i = 0; i < species.size(); i++) {
            String specie = species.get(i);
            seriesMap.computeIfAbsent(specie, k -> new XYSeries(specie))
                    .add(sepalLengths.get(i), petalLengths.get(i));
        }

        seriesMap.values().forEach(dataset::addSeries);

        JFreeChart chart = ChartFactory.createScatterPlot(
                "Sepal Length vs Petal Length",
                "Sepal Length (cm)",
                "Petal Length (cm)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Customize colors and shapes for each species
        XYPlot plot = chart.getXYPlot();
        XYItemRenderer renderer = plot.getRenderer();

        // Set different colors and shapes for each species
        renderer.setSeriesPaint(0, new Color(255, 0, 0, 150));      // Red for Setosa
        renderer.setSeriesShape(0, new java.awt.geom.Ellipse2D.Double(-3, -3, 6, 6));

        renderer.setSeriesPaint(1, new Color(0, 0, 255, 150));      // Blue for Versicolor
        renderer.setSeriesShape(1, new java.awt.geom.Rectangle2D.Double(-3, -3, 6, 6));

        renderer.setSeriesPaint(2, new Color(0, 180, 0, 150));     // Green for Virginica
        renderer.setSeriesShape(2, new java.awt.geom.Ellipse2D.Double(-4, -4, 8, 8));

        // Customize plot appearance
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

        return chart;
    }

    // Bar Chart: Average Sepal Length per Species
    public JFreeChart createBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Calculate average sepal length per species
        for (Map.Entry<String, List<Double>> entry : speciesSepalLengths.entrySet()) {
            String specie = entry.getKey();
            List<Double> lengths = entry.getValue();
            double average = lengths.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            dataset.addValue(average, "Sepal Length", specie);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Average Sepal Length by Species",
                "Species",
                "Sepal Length (cm)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Customize chart appearance
        chart.setBackgroundPaint(Color.WHITE);
        return chart;
    }

    // Box Plot: Sepal Length Distribution by Species
    public JFreeChart createBoxPlot() {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();

        // Add sepal length data for each species
        for (Map.Entry<String, List<Double>> entry : speciesSepalLengths.entrySet()) {
            dataset.add(entry.getValue(), "Sepal Length", entry.getKey());
        }

        JFreeChart chart = ChartFactory.createBoxAndWhiskerChart(
                "Sepal Length Distribution by Species",
                "Species",
                "Sepal Length (cm)",
                dataset,
                true
        );

        // Customize chart appearance
        chart.setBackgroundPaint(Color.WHITE);
        return chart;
    }

    // Display charts in a JFrame with tabs
    public void displayCharts() {
        JFrame frame = new JFrame("Iris Dataset Visualizations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Add charts as tabs
        tabbedPane.addTab("Scatter Plot", new ChartPanel(createScatterPlot()));
        tabbedPane.addTab("Average Sepal Length", new ChartPanel(createBarChart()));
        tabbedPane.addTab("Sepal Length Distribution", new ChartPanel(createBoxPlot()));

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IrisScatterPlot irisPlot = new IrisScatterPlot();
            irisPlot.readIrisData("src/main/resources/Iris.csv"); // Update path as needed
            irisPlot.displayCharts();
        });
    }
}