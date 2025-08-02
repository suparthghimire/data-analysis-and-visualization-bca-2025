# Lab 15: Visualizing Real-World Vector Fields in 2D and 3D

## Objective

In this lab, you will apply four visualization techniques to **real-world vector field data**. These include glyphs, streamlines, stream tubes, and simulated stream ribbons. You will choose a dataset that contains 2D or 3D vector components (e.g., velocity, wind, or current direction).

You will explore how each method reveals different characteristics of the flow such as directionality, continuity, magnitude, and vorticity.

---

## Dataset Requirement

Choose **one real-world vector field dataset** from a source such as **Kaggle**, **NOAA**, or **UCI Machine Learning Repository**. Your dataset must include **at least 2 vector components** (e.g., `u` and `v`, or `vx`, `vy`, `vz`).

---

## Tasks & Deliverables

You must complete **four visualizations** using your chosen dataset. For each, you must submit:

1. The **Python code** that processes and visualizes the vector field
2. The resulting **figure**
3. A short **markdown explanation** including:
   - What the dataset represents (context, source, dimensions)
   - Which visualization technique is used
   - One insight or observation drawn from the plot

---

### 1. Vector Glyphs (Quiver Plot)

- Use `matplotlib.pyplot.quiver()` to plot vector arrows over the field.
- The arrow direction should reflect flow direction, and length should reflect magnitude.

---

### 2. Streamlines

- Use `matplotlib.pyplot.streamplot()` or `seaborn.lineplot()` to create continuous streamlines.
- Use color or line width to encode flow speed if applicable.

---

### 3. Stream Tubes (3D)

- Convert or extract 3D data (if available).
- Use `plotly.graph_objects.Streamtube()` to visualize the 3D vector field.
- Stream tubes should show spatial flow and use color to represent velocity magnitude.

---

### 4. Stream Ribbons (Simulated with Offset Tubes)

- Use two slightly offset stream tubes to simulate a ribbon effect.
- This helps depict **twisting**, **vorticity**, or flow divergence.
- Use distinct color mapping to enhance spatial perception.
