def call (String imageName, String imageTag) {
  sh """
    docker stop django-app || true
    docker rm django-app || true

    docker run -d --name django-app -p 8000:8000 ${imageName}:${imageTag}

    """
  
}
