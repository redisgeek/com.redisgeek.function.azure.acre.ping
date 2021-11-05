[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

[![mvn test](https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/actions/workflows/mvn-test.yml/badge.svg)](https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/actions/workflows/mvn-test.yml)

# com.redisgeek.function.azure.acre.ping
## Spring Cloud Function with Azure for ACRE "Ping"

A function to login and "ping" a Redis connection.
The function starts via the TimerTrigger every 5 minutes.

### Built with:

* [Spring Cloud Function](https://spring.io/projects/spring-cloud-function)
* [Azure SDK for Java](https://github.com/Azure/azure-sdk-for-java)
* [Azurite](https://docs.microsoft.com/en-us/azure/storage/common/storage-use-azurite)

## | [Getting Started](#getting-started) | [See Also](#see-also)  | [License](#license) |

## Getting Started

The function gets configuration from the environment variables.
The variables are shown in local.settings.json.
The values will be grabbed from the prerequisite deployed resources.

### Clone the Repository w/ Submodules

To install this example application, run the following commands:
```bash
git clone git@github.com:redisgeek/com.redisgeek.function.azure.acre.ping.git
cd com.redisgeek.function.azure.acre.ping
```

### Initialize Azurite and Redis for local development

```bash
docker-compose up -d
```

### Run the function locally

```bash
./mvnw clean package azure-functions:run
```
>Runs the function locally, but connects to Azure Resource Manager

## See Also

[acre-terraform-cron-replication](https://github.com/redisgeek/acre-terraform-cron-replication)

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/issues) for a list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing

Pull-requests are welcomed!

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.

[contributors-shield]: https://img.shields.io/github/contributors/redisgeek/com.redisgeek.function.azure.acre.ping.svg?style=for-the-badge
[contributors-url]: https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/redisgeek/com.redisgeek.function.azure.acre.ping.svg?style=for-the-badge
[forks-url]: https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/network/members
[stars-shield]: https://img.shields.io/github/stars/redisgeek/com.redisgeek.function.azure.acre.ping.svg?style=for-the-badge
[stars-url]: https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/stargazers
[issues-shield]: https://img.shields.io/github/issues/redisgeek/com.redisgeek.function.azure.acre.ping.svg?style=for-the-badge
[issues-url]: https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/issues
[license-shield]: https://img.shields.io/github/license/redisgeek/com.redisgeek.function.azure.acre.ping.svg?style=for-the-badge
[license-url]: https://github.com/redisgeek/com.redisgeek.function.azure.acre.ping/blob/master/LICENSE.txt