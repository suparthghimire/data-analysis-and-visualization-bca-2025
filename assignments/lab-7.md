# Lab 7: Visualizing Tree Data

## Dataset Requirement

- You may choose a **real-world dataset** that exhibits a **tree-like hierarchy** (e.g., organizational structures, file systems, product categories).
- Alternatively, you may **simulate hierarchical data at runtime**, but your simulation must be presented as if it represents a plausible real-world scenario. **Avoid arbitrary labels** like `A → B → C` without context or meaning.

## Tasks & Deliverables

For each of the visualizations below, submit:

1. **Code cell(s)** that reproduce the plot
2. A **figure** saved inline in your notebook
3. A **Markdown explanation** including:
   - Dataset description (source, contents, number of rows/columns)
   - Features used for visualization
   - One observation or insight per plot

### 1. Node-Link Diagram

- Create a **node-link tree diagram** to represent hierarchical parent–child relationships.
- You may choose a **top-down**, **left-right**, or **radial layout**.
- Nodes must display meaningful **labels**, and use **color or size** to encode a quantitative attribute (e.g., revenue, count, weight).

### 2. Indented Tree (AST Visualization)

- Construct an **Abstract Syntax Tree (AST)** for a basic mathematical expression parser.
- Implement a tree that reflects the **post-order traversal** of the expression.
- Visualize the AST using an **indented tree format**.
- Use the following example expression:
  - `(1 + 2) - 3 * (7 / 4 + (5 - 7))`
  - - The expected indented tree structure is:

```txt
-
├── +
│   ├── 1
│   └── 2
└── *
    ├── 3
    └── +
        ├── /
        │   ├── 7
        │   └── 4
        └── -
            ├── 5
            └── 7
```

### 3. Tree map

- Create a **tree map** where each rectangle represents a node.
- Each rectangle should represent a node in the hierarchy.
- Use nesting to convey parent–child relationships, and color/size to reflect a quantitative variable.
- Include hover labels to show names and values for each node.
