# gcp-endpoint-app

This application has all the necessary configuration and code to deploy 
and run api in google cloud end points.

To start application in local, please give below env variable:
GOOGLE_APPLICATION_CREDENTIALS=<PATH_TO_SERVICE_ACCOUNT_KEY_JSON_FILE>

This setting isn't required if application is running in GCP so don't bundle your
service account file in docker image because it contains sensitive information.

References:

1. https://cloud.google.com/endpoints/docs/openapi/get-started-kubernetes-engine
2. https://spring.io/guides/topicals/spring-boot-docker/
3. https://spring.io/blog/2020/01/27/creating-docker-images-with-spring-boot-2-3-0-m1
