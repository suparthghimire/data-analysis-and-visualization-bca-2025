### Setup the development environment

> Before you begin, it is better to have a terminal/CLI application that has many features. CMD/Powershell in Windows and basic shell in Mac/Linux have very less features. You can install [oh-my-posh](https://ohmyposh.dev/) on windows and [oh-my-zsh](https://ohmyz.sh/) on Mac/Linux to make the terminal/CLI have more features like listing your current git repository, showing virtual environments, etc. Optionally, for Mac and Windows you can install [Warp terminal](https://www.warp.dev/) that has built in Agent Features as well as other cosmetic features.

First, you need to fork the [data analysis and visualization bca 2025](https://github.com/suparthghimire/data-analysis-and-visualization-bca-2025) on GitHub and follow the instructions at [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh) to setup your SSH authentication credentials.

> Note you can also clone using your [PAT](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens), however SSH is a better option as you will not have to constantly provide PAT whenever you have to push your changes

Then clone the [data analysis and visualization bca 2025 project](https://github.com/suparthghimire/data-analysis-and-visualization-bca-2025) and setup the development environment:

```bash
git clone git@github.com:<YOUR_USERNAME>/data-analysis-and-visualization-bca-2025.git

cd data-analysis-and-visualization-bca-2025
```

It is important that we create a [virtual environment](https://docs.python.org/3/library/venv.html) before proceeding to develop locally.

```bash
python -m venv venv
```

Now to activate the virtual environment, you will have to depend on the `OS` you have.

- Windows

```powershell
Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser

.\venv\Scripts\Activate.ps1
```

- Mac/Linux

```bash
source venv/bin/activate
```

After this you will see (venv) added in your terminal (if you are not using the default terminal).

Now you can start working. by creating a new feature branch with following syntax: `feat/<your-first-name>`

```bash
git checkout -b feat/<your-first-name>
```

After you finish your work and want to add a checkpoint it, you can do by following these commands

```bash
# Add files to git staging area
git add -A
# Or
git add filename.ext

# Commit
git commit -m "<commit-message>"
```

> Please use descriptive commit messages. To know the best practices of commit messages, [read here](https://www.conventionalcommits.org/en/v1.0.0/#summary)

To submit your code, follow these steps

```bash
# Make sure you have the latest changes from main branch. Rebase your current branch with main branch
git pull parent main --rebase

# push your code to your branch (In your fork)
git push origin <current-branch-name>
```

Now go-to [data analysis and visualization bca 2025 project](https://github.com/suparthghimire/data-analysis-and-visualization-bca-2025) repository and open a Pull Request from `feat/<your-branch-name>` branch to `main` branch

On the review section, select a reviewer (Usually the teacher)

### Code Review

After you create a pull request, inform it to your reviewer. If any code review comments are left in your PR, resolve them and again push your changes. Your lab will be counted as submitted if your code is in main branch.

If you have any questions, please contact the owner of the repository.
