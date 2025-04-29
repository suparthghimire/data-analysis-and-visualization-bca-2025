# Lab 1: Chart Basics

## Objective

Practice creating basic visualizations using Matplotlib, Numpy, Pandas, and optionally mplfinance and ipywidgets.

---

## 🧪 Section A: Line and Scatter Plots

1. **Line Plot**  
   Create a line plot showing the square of values from 1 to 10.

   - Label the X and Y axes appropriately.
   - Add a title to the chart.

2. **Multiple Line Plot**  
   Use `numpy` to generate 100 values between 0 and 2π. Plot `sin(x)` and `cos(x)` on the same figure.

   - Add a legend to distinguish the two lines.
   - Use different line styles or colors.

3. **Scatter Plot with Random Data**  
   Generate 100 random `(x, y)` points using `np.random.randn`.
   - Color the points differently depending on whether x is positive or negative.
   - Add axis labels and a title.

---

## 📊 Section B: Bar and Pie Charts

4. **Bar Chart – Province Populations**  
    Use dummy data for the population of five provinces in Nepal.
   g

   - Create a bar chart.
   - Label each bar with the province name and set axis titles.
   - Use a unique color for each bar.

5. **Pie Chart – Province Populations**  
   Using the same data as above:
   - Create a pie chart.
   - Label each slice with the province name and percentage.
   - Explode the largest slice for emphasis.

---

## 📈 Section C: Time Series Plotting

6. **Temperature Time Series**
   - Create a `pandas` DataFrame with a `Date` column (30 days) and random temperature values.
   - Plot the temperature as a line chart.
   - Format the x-axis to show dates properly.

---

## 🧭 Section D: Candlestick Chart

7. **Candlestick Chart with `mplfinance`**
   - Create a DataFrame with columns: `Date`, `Open`, `High`, `Low`, `Close`, and optionally `Volume`.
   - Plot a candlestick chart using `mplfinance`.
   - Customize the title and figure size.

---

## 🎛 Section E: Interactivity

8. **Interactive Function Plotter**
   - Use `ipywidgets` to let a user choose:
     - Checkbox to show `sin`, `cos`, `tan` curves
     - A color
     - Number of points (e.g., 50, 100, 200)
   - Plot the selected function interactively with the chosen parameters.
