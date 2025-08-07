% Basic Iris Dataset Visualization in MATLAB %

% 1. Import Iris Dataset %
load fisheriris     % Loads 'meas' (150x4 matrix) and 'species' (150x1 cell array) %
features = {'Sepal Length','Sepal Width','Petal Length','Petal Width'};

% 2. Histogram: Petal Width Distribution %
figure
histogram(meas(:,4), 15)
xlabel(features{4})
ylabel('Frequency')
title('Histogram of Petal Width')

% 3. Scatter Plot: Sepal Length vs Petal Length %
figure
gscatter(meas(:,1), meas(:,3), species, 'rgb', 'o', 8)
xlabel(features{1})
ylabel(features{3})
title('Scatter Plot: Sepal Length vs Petal Length')
legend('Setosa', 'Versicolor', 'Virginica')

% 4. Bar Chart: Count of Each Species %
figure
species_cat = categorical(species);        % Convert to categorical %
counts = countcats(species_cat);          % Count each species %
bar(counts)
set(gca, 'XTickLabel', categories(species_cat))
xlabel('Species')
ylabel('Count')
title('Bar Chart: Number of Samples per Species')

% 5. Box Plot: Petal Width by Species %
figure
boxplot(meas(:,4), species)
xlabel('Species')
ylabel(features{4})
title('Box Plot: Petal Width by Species')

% 6. Pie Chart: Species Distribution %
figure
pie(counts, categories(species_cat))
title('Pie Chart: Species Proportion')

% 7. Line Chart: Petal Width for First 10 Samples %
figure
plot(meas(1:10, 4), '-o')
xlabel('Sample Index')
ylabel(features{4})
title('Line Chart: Petal Width (First 10 Samples)')

% 8. Heatmap: Correlation Between Features %
corr_matrix = corr(meas);     % Compute correlation matrix %
figure
heatmap(features, features, corr_matrix, 'Colormap', parula, 'ColorLimits', [-1 1])
title('Heatmap: Correlation Between Features')
