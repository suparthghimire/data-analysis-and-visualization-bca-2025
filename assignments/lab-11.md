# Lab 11: Visualizing Time Series Data

## Dataset Requirement

- Use a **real-world time series dataset** (e.g., temperature readings, stock prices, energy consumption, web traffic, etc.).
- Your dataset must:
  - Contain a **datetime or timestamp** column
  - Include at least one **quantitative variable**
  - Have consistent time intervals (daily, weekly, monthly, etc.)

## Tasks & Deliverables

For each of the following visualizations, submit:

1. **Code cell(s)** that generate the plot
2. The resulting **inline figure**
3. A **Markdown explanation** including:
   - Description of the dataset (source, content, number of rows/columns)
   - Features used for the plot
   - One observation or insight per visualization

### 1. Line Plot

- Create a **line plot** of the time series variable.
- Label the x-axis as time and the y-axis as the measured value.

### 2. Seasonal Decomposition

- Apply **seasonal decomposition** (additive or multiplicative) to your time series.
- Plot the observed, trend, seasonal, and residual components.

### 3. Bar Chart

- Group the time series (e.g., by month or weekday).
- Show a **bar chart** summarizing average or total values per group.

### 4. Calendar Heatmap

- Create a **calendar heatmap** to visualize daily (or weekly) patterns over a year.
- Use color intensity to indicate magnitude.

### 5. Autocorrelation Plot

- Plot the **autocorrelation** of the time series using statistical lags.
- Comment on any significant periodic patterns or self-similarity.

### 6. Lag Plot

- Create a **lag plot** to assess linearity or randomness in the time series.
- Use a meaningful lag (e.g., lag-1, lag-7) based on your data context.
