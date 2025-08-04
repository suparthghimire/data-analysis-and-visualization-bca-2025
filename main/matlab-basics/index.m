% Basic Matlab Commands %
 
% 1. How to create variable %
x = 10;
y = 2.2;
name_char = 'DAV'
name_str = "DAV"

% 2. How to print %
disp(x) % 10 %
disp(y) % 2.2 %
disp(name_char) % DAV %

% 3. Check variable type %
class(x) % double %
class(name_char) % char %
class(name_str) % string %

% 4.  Clear Variable from Workspace %
clear all  
% OR % 
clear

% 5. Clear command window  %
clc

% 6. String Operators % 
str = "Hello";
strlength(str) % 5 -- count total characters in string%
upper(str) % HELLO -- uppercase%
lower(str) % hello -- lowercase%
another_str = "World"
combined = str + another_str % HelloWorld -- Concatenate Strings % 


% 6. arrays % 
row = [1, 2, 3] % row vector % 
col = [1; 2; 3] % col vector % 
Matrix = [1 2 3; 4 5 6; 7 8 9]; % Matrix % 

% 6.1. Access Array Elements % 
row(2)      % 2 -- array index starts from 1 in matlab %
Matrix(2,3)      % 6 -- row 2, column 3 %

% 6.2. Array Operators %
length(row)
size(Matrix)
sum(row)
mean(row)
row'      % transpose row to column
