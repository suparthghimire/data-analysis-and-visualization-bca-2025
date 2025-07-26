# Lab 9: Visualizing Text Data

## Dataset Requirement

- Use a **real-world text dataset** such as:
  - Product reviews
  - News articles
  - Tweets or social media posts
  - Research abstracts
- Your dataset must include at least **50 sentences** in English.

## Tasks & Deliverables

For each of the following tasks, submit:

1. **Code cell(s)** that generate the visualization
2. An **inline figure** showing the result
3. A **Markdown explanation** that includes:
   - Description of the dataset (source, content, number of entries)
   - Feature used for visualization
   - One observation or insight per visualization

### 1. Character-Level Representation (Heatmap)

- Choose a sentence or small paragraph from your dataset.
- Count the frequency of **characters**.
- Display a **heatmap** of character frequencies.

### 2. Word-Level Representation (Bar Chart)

- Tokenize words from a representative document or set of sentences.
- Count the frequency of **words** (excluding stopwords).
- Show a **bar chart** of the most frequent words.

### 3. N-Gram Representation (Bar Chart)

- Generate **n-grams** (bigrams or trigrams) from your text.
- Count the frequency of each n-gram.
- Plot the top n-grams using a **bar chart**.

### 4. TF-IDF Representation (Heatmap + Query Search)

#### A. Heatmap of TF-IDF

- Compute **TF-IDF scores** for terms across a sample of documents.
- Visualize the top-scoring terms per document using a **heatmap**.

#### B. Runtime Query-Based Search Using TF-IDF

- Accept a **query string at runtime** (e.g., `"battery life"` or `"climate change"`).
- Compute its **TF-IDF vector**.
- Compare it with all documents in the dataset (using cosine similarity or dot product).
- Identify and display:

  - The document where the query has **highest TF-IDF relevance**
  - The **similarity score**
  - The **full text** of the matched document

- **Example Scenario**:

  - Suppose your dataset contains the following:

  - **Document 1 content**: The camera quality of this phone is excellent, especially in low light.

  - **Document 2 content**: Battery life is impressive and easily lasts more than a day.

  - **Document 3 content**: I like the sleek design and build, but the battery drains quickly.

  - **Query text**: battery life
  - **Your output should be:**
    - **Most relevant document**: Document 2
    - **Similarity score**: `some numeric value`
      > _Note: You may use `TfidfVectorizer` from scikit-learn and `cosine_similarity` for comparison._

### 5. Embeddings with spaCy

- Use `spacy` with the `en_core_web_md` model.
- Extract **word embeddings** for selected words or sentences.
- Reduce dimensions using PCA or t-SNE.
- Plot a **2D scatter** showing similarity between word vectors.

### 6. Word Cloud

- Generate a **word cloud** for the entire corpus.
- Exclude stopwords.
- Use word size and color to reflect frequency.
