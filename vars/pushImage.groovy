def call (String imageName, String imageTag) {
 withCredentials([
   usernamePassword(   
    credentialsId: 'Dockerhub',
    usernameVariable: 'DOCKER_USERNAME',
    passwordVariable: 'DOCKER_PASSWORD'
     )
  ]) {
    sh """
      echo "\$DOCKER_PASSWORD" | docker login -u "\$DOCKER_USERNAME" --password-stdin

      docker push ${imageName}:${imageTag}

      docker logout
      """    
  }
}
