# Lab 10: Visualizing Flow Data

## Dataset Requirement

- Use a **real-world flow dataset** such as:
  - Migration between countries
  - Website clickstream data
  - Customer journey steps
  - Energy flow between sectors
  - Trade between regions

Your dataset must contain **at least two levels of flow or directionality**, and include **quantitative values** associated with those flows.

## Tasks & Deliverables

For each of the following visualizations, submit:

1. **Code cell(s)** that generate the plot
2. The resulting **inline figure**
3. A **Markdown explanation** including:
   - Description of the dataset (source, content, number of rows/columns)
   - Features used for the plot
   - One insight or observation per visualization

### 1. Sankey Diagram

- Create a **Sankey diagram** showing flow between at least two stages.
- Nodes should represent entities or stages.
- Link thickness should reflect flow quantity.

### 2. Alluvial Plot

- Visualize the flow between categories across **three or more stages** using an **alluvial diagram**.
- Use color or ordering to show transitions and consistency over stages.

### 3. Chord Diagram (with Bokeh)

- Use **Bokeh** to generate a **chord diagram** from a symmetric matrix or directed flow table.
- Nodes should represent entities; arcs represent flows.
- Arc thickness should reflect the strength or value of the connection.

### 4. Directed Graph (Flow Style)

- Create a **directed graph** to represent flow-based relationships.
- Show direction with arrows and use edge weights or colors to represent intensity.

### 5. Stream Graph

- Plot a **stream graph** to visualize changes in flow volume over time.
- Use stacking and flow shapes to represent multiple overlapping categories.
- X-axis must represent time or ordered stages.
