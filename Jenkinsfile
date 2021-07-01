pipeline{
    agent any
    stage{

        stage ("Compile Stage"){

            steps{
                withMaven (){
                    sh 'mvn clean install'
                }
            }
        }
    }
    stage{

        stage ("Test Stage"){

            steps{
                withMaven (){
                    sh 'mvn clean test'
                }
            }
        }
    }
    stage{

        stage ("Cucumber Reports"){

            steps{
                cucumber buildStatus:"UNSTABLE",
                        fileIncludePattern:"**/cucumber.json",
                       jsonReportDirectory: "target"

            }
        }
    }
}