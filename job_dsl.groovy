folder('Tools') {
    description('Folder for miscellaneous tools.')
    job('Tools/clone-repository') {
        parameters {
            stringParam('GIT_REPOSITORY_URL', null, 'Git URL of the repository to clone')
        }
        steps {
            shell('git clone ${GIT_REPOSITORY_URL}')
        }
        wrappers {
        preBuildCleanup()
       }
    }

    job('Tools/SEED') {
        parameters {
            stringParam("GITHUB_NAME", null, 'GitHub repository owner/repo_name (e.g.: "EpitechIT31000/chocolatine)')
            stringParam("DISPLAY_NAME", null, 'Display name for the job')
        }
    }
}
