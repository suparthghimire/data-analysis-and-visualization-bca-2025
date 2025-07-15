# Lab 5: 2D (Bivariate) Data Visualization

## Objective

This lab will help you build fluency in visualizing two-dimensional (bivariate) data. You will explore a wide variety of plot types that allow you to study relationships between numerical and categorical features, trends over time, and correlation structures in real-world datasets.

All plots must be accompanied by:

- A short paragraph explaining the dataset used
- Feature(s) selected for the visualization
- A brief analysis or insight from the chart

---

## Dataset Requirement

- Use a real-world dataset from Kaggle (https://www.kaggle.com/)
- The dataset must contain:
  - At least 2 numerical variables
  - At least 1 categorical variable
  - A timestamp/date column is recommended for time-based visualizations

---

## 1. Scatter Plot Visualizations

### Required Charts

- [ ] Basic Scatter Plot between two numeric variables
- [ ] Bubble Chart: Encode third variable using size or color
- [ ] Grouped / Color-Coded Scatter Plot using a categorical feature
- [ ] Regression Line (manual calculation using least squares method)
- [ ] Regression Line using `sklearn.linear_model.LinearRegression`
- [ ] Scatter Matrix using `pandas.plotting.scatter_matrix()`
- [ ] Pair Plot using `seaborn.pairplot()` with color grouping (`hue`)

For regression, include prediction example and equation displayed on the chart.

---

## 2. Line Chart Visualizations

### Required Charts

- [ ] Basic Line Chart (e.g., stock prices or sales over time)
- [ ] Multi-Series Line Chart (compare trends across multiple categories)
- [ ] Stacked Area Chart (cumulative comparison of multiple series)
- [ ] Spline/Smoothed Line Chart
- [ ] Step Line Chart (data points change in steps rather than smooth flow)

Use time series or any continuous variable as the x-axis. All plots should be clearly labeled with consistent axis limits for comparison.

---

## 3. Heatmap Visualizations

### Required Charts

- [ ] Basic Matrix Heatmap for any 2D array or numeric matrix
- [ ] Correlation Heatmap using `.corr()` from Pandas
- [ ] Custom Correlation Heatmap (manual calculation of Pearson/Spearman)
- [ ] Calendar Heatmap (e.g., GitHub-style contribution heatmap)
- [ ] Clustered Heatmap using `seaborn.clustermap()`
  - Include dendrograms for both rows and columns
  - Describe clusters formed and their interpretation
- [ ] Geographic Heatmap (Non-spatial)
  - Use `plotly`, `folium`, or any mapping library
  - Highlight heat using region/state/country-level summaries (e.g., COVID cases, sales by region)

---

## Deliverables

- For each plot:
  - Clear title and axis labels
  - Clean visualization using Matplotlib/Seaborn/Plotly/Pandas
  - Markdown cell describing:
    - What the chart shows
    - Why the chart was chosen
    - At least one insight from the data
- Code should be clean, modular, and reproducible

---

## Submission Checklist

- [ ] Dataset loaded, cleaned, and documented
- [ ] All required visualizations created
- [ ] Each chart includes explanation and interpretation
- [ ] Jupyter Notebook is well-organized, runs top-to-bottom without error
