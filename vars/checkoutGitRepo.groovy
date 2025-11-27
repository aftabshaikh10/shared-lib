def call(Map args = [:]) {
    // Default URL if not passed
    def repoUrl = args.url ?: 'https://github.com/aftabshaikh10/addressbook.git'
    def branchName = args.branch ?: 'main'   // change if your branch is master

    git url: repoUrl, branch: branchName
}

