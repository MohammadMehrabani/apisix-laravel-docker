# Manage Laravel Microservices APIs with Apache APISIX API Gateway

This is an example project focus on the usage of [**Apache APISIX API Gateway**](https://apisix.apache.org/)
for applications developed in **[PHP Laravel](https://laravel.com)**.

## Build a multi-container APISIX via Docker CLI

You can start the application by running `docker compose` command from the root folder of the project:

``` bash
docker-compose -p docker-apisix up -d
```

create .env:

``` bash
cd laravel && cp .env.example .env
```

install laravel dependency packages:

``` bash
docker-compose run --rm composer install
```

create APP_KEY:

``` bash
docker-compose run --rm artisan key:generate
```

run migration:

``` bash
docker-compose run --rm artisan migrate
```

create JWT_SECRET:

``` bash
docker-compose run --rm artisan jwt:secret
```