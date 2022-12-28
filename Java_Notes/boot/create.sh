# this bash script will be used to create my sports docker image
# I will use this script instead of manually entering commands so i dont actually make a spelling mistake

# Runs Maven package
mvn package
# Builds image
docker build -t michaelnewberg/practice:file .
# Pushes image to dockerhub
docker push michaelnewberg/practice:file
# Composes container using image
docker compose up -d
