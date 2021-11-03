def call(String repoUrl){
  pipeline {
    agent any
    stages{
      
//       stage('Tools initilization')
//       {
//         steps{
//         sh "mvn --version"
//         sh "mvn --version"
//         }
//       }
      stage('Code checkout'){
        steps{
            echo 'Pulling...' + env.BRANCH_NAME

//          git branch: 'master'
//          url: "${repoUrl}"
        }
        
      }
      
      
    }
    
    
  }
  
}
