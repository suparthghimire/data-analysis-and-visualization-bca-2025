# Lab 6: Visualization of Graph Data

## Dataset Requirement

- You may choose a **real-world dataset** that exhibits a **graph like structure**.
- Alternatively, you may **simulate data**, but your simulation must be presented as if it represents a plausible real-world scenario. **Avoid arbitrary labels** like `A → B → C` without context or meaning.

## Tasks & Deliverables

For each of the visualizations below, submit:

1. **Code cell(s)** that reproduce the plot
2. A **figure** saved inline in your notebook
3. A **Markdown explanation** including:
   - Dataset description (source, contents, number of rows/columns)
   - Features used for visualization
   - One observation or insight per plot

### 1. Directed Graph Visualization

- Create a **directed graph** using your dataset.
- Show arrowheads on edges to indicate direction.
- Display node labels and edge weights.

### 2. Undirected Graph Visualization

- Visualize the same graph (or a relevant subgraph) as **undirected**.
- Node and edge styles should clearly distinguish it from the directed version.
- Include edge weights.

### 3. Weighted Graph Visualization

- Visualize a **weighted graph**, using:
  - **Edge thickness** or **color intensity** to indicate weight
  - Labels to display exact numeric weights
- You may use any layout (spring, circular, etc.)

### 4. Algorithm Implementation: Choose One

#### Option A: A\* Pathfinding

- Implement **A\*** algorithm between two nodes.
- Output must include:
  - The **shortest path**
  - The **heuristic distance**
  - A **graph visualization** showing:
    - All nodes and edges
    - The **highlighted path**

#### Option B: Kruskal’s Minimum Spanning Tree (MST)

- Implement **Kruskal's algorithm** on your weighted graph.
- For each step of the algorithm:
  - Visualize the **intermediate MST** with newly added edges
- Final output must include:
  - The **complete MST**
  - A visualization highlighting only MST connections
