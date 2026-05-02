def call(string githuburl, string branch){
     echo(message: 'Cloning the repo')
    git(url: "${githuburl}", branch: "${branch}")
    echo(message: 'Repo cloned successfully')
}