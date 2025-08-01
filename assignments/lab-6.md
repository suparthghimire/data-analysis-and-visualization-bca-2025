# Lab 6: Visualization of multi dimensional data

## Objective

Build fluency in visualizing both bivariate and multivariate relationships. You will apply a range of techniques—from simple scatter plots to dimensionality‑reduction methods (PCA, t‑SNE, parallel coordinates)—on a real‑world dataset.

---

## Dataset Requirement

- Choose a real‑world dataset from Kaggle (https://www.kaggle.com/).
- **Do not** use the Iris dataset.
- Your dataset **must** include:
  - At least **3 numeric** variables
  - At least **1 categorical** variable
  - **(Optional)** A timestamp/date column if you wish to include time‑series plots

---

## Tasks & Deliverables

For each of the sections below, you must submit:

1. **Code cell(s)** that reproduce the plot
2. A **figure** saved inline in your notebook
3. A **Markdown explanation** including:
   - Dataset description (source, contents, number of rows/columns)
   - Features selected for the plot
   - A short analytical insight or observation

### 1. Parallel Coordinates

- Plot a **parallel‑coordinates plot** of at least 4 numeric features, colored by your categorical variable.
- Explain why parallel coordinates help reveal multivariate patterns in your data.

### 2. Scatter‑Plot Matrix

- Create a **scatter_matrix** (Pandas) of your numeric features.
- Color‑code points by the categorical feature.
- Describe one strong bivariate relationship and one pair that shows overlap or ambiguity between categories.

### 3. Seaborn Pairplot

- Produce a **pairplot** with Seaborn, using `hue` to encode your category.
- Comment on any clusters or outliers you observe.

### 4. PCA Projection

- Run **PCA** to reduce your numeric features to **2 components**.
- Create a **2D scatter** of the PCA projection, coloring by category.
- Label each axis with the percentage of variance explained.
- Write one paragraph on how well PCA separates your categories.

### 5. t‑SNE Embedding

- Apply **t‑SNE** (two components) to the same numeric features.
- Plot the t‑SNE embedding with points colored by category.
- Compare the t‑SNE clusters to those from PCA in a short paragraph: which method better preserved local groupings?

---

## Submission Checklist

- [ ] Notebook runs **top‑to‑bottom** without errors
- [ ] All required plots are present and correctly labeled
- [ ] Each plot is accompanied by a Markdown analysis
- [ ] Dataset source and description at the top of your notebook
- [ ] File uploaded to your course submission portal
