# Lab 12: Scalar Field and Volume Visualization

## Part 1: Scalar Field Visualization

### Task

Create your own scalar field functions in:

- **1D**: \( f(x) \)
- **2D**: \( f(x, y) \)
- **3D**: \( f(x, y, z) \)

### Instructions

1. Choose or define the following scalar functions:

   - **1D**: e.g. $f(x) = \sin(x) \cdot e^{-x^2/10}$
   - **2D**: e.g. $f(x, y) = \sin(x^2 + y^2)$
   - **3D**: e.g. $f(x, y, z) = \cos(\sqrt{x^2 + y^2 + z^2})$

2. Visualize them using:
   - **1D**: Line plot (x vs f(x))
   - **2D**: Heatmap or contour plot
   - **3D**: Use isosurfaces or 3D slices

### Deliverables

For each dimension:

- The code that generates the scalar field
- The visualization
- Markdown explanation of:
  - Function form and why it was chosen
  - Interpretation of the plot
  - Observations about the shape and behavior of the field

## Part 2: Isocontours and Topographic Mapping

### Task

Use a real-world dataset that represents **spatial or geographic scalar data**, and generate:

- **Isocontour plots**
- **Topographic-style maps**

### Instructions

1. Load the dataset and extract or generate a 2D scalar field (e.g., temperature, elevation, pressure).
2. Generate an isocontour plot.
3. Overlay contour lines on a color map (like a topographic map).
4. For 3D datasets (optional), visualize slices or isosurfaces.

### Deliverables

For the selected dataset:

- Source and basic description of the data
- Code to load, transform, and visualize the scalar field
- At least one isocontour plot and one topographic map-style figure
- Markdown summary including:
  - Explanation of visualization method
  - Insights from the data
  - Challenges or interesting patterns
