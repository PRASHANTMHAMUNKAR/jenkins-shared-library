def call (String imageName, String imageTag) {
  sh """
  docker compose down
  docker compose pull
  docker compose up -d

    """
  
}
