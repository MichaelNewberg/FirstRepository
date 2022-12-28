# Prometheus
Prometheus is an open source monitoring and alerting tool that provides a way to aggregate application metrics within a time-series database and then visualize the data using tools like Grafana.
    -A time-series database adds a timestamp to the data stored, and it's capable of adding other key/value pairs to the data.
    -Prometheus makes use of PromQL(prom query language) to find data and perform operations upon it.
    -it also makes use of a pulling system that is called "scrapping".
    -Prometheus is capable of discovering services but it can also be configured to target static services.
    -Prometheus supports multiple options when it comes to graphing/dashboarding the data it stores/calculates via PromQL.