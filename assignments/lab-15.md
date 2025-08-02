# Lab 15: Dataset Visualization

## Part 1: Iris Dataset

### Description

- A dataset of flower measurements for three species of Iris.
- Features: sepal length/width, petal length/width.

### Tasks

1. Load the Iris dataset (use `sklearn.datasets.load_iris` or CSV version).
2. Visualize using:
   - **Scatter plots**: petal length vs. petal width, colored by species.
   - **Pair plots**: relationships between all features.
   - **Box plots**: compare sepal width across species.
   - **Violin plots** _(optional)_: distributions of petal length per species.

### Deliverables

- Code and plots.
- A short markdown explanation (3–5 sentences) for each plot type:
  - What it shows
  - Why the chosen method is effective
  - What insights it reveals

---

## Part 2: Breakfast Cereal Dataset

### Description

- Nutritional values (e.g., sugar, fiber, calories, protein) and ratings of cereals.

### Tasks

1. Load the dataset (`cereal.csv` from [Kaggle](https://www.kaggle.com/crawford/80-cereals))
2. Visualize using:
   - **Bar charts**: show sugar content of top 10 cereals.
   - **Histograms**: distribution of calorie values.
   - **Bubble plots**: sugar vs. protein, size = rating.
   - **Small multiples** _(optional)_: e.g., sugar by manufacturer.

### Deliverables

- Code and plots.
- A markdown interpretation for each:
  - Patterns in nutrition
  - Which brands or cereals stand out
  - Design decisions made (labels, scales, ordering)

---

## Part 3: Dow Jones Industrial Average (DJIA)

### Description

- Daily time-series of DJIA index (e.g., 2020–2025).
- Data includes Open, High, Low, Close, Volume.

### Tasks

1. Load data using `yfinance.download('^DJI')`.
2. Visualize using:
   - **Line plot**
   - **Candlestick chart**
   - **Autocorrelaton Plot**

### Deliverables

- Code and visualizations.
- A markdown interpretation for each:
  - Market events or trends visible in the plots
  - Any smoothing techniques used
  - Effective use of color, labels, annotations
