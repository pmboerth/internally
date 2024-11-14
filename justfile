dev: backend-dev frontend-dev

backend-dev:
    #!/usr/bin/env bash
    cd backend
    docker compose up -d
    ./mvnw spring-boot:run

backend-build:
    #!/usr/bin/env bash
    cd backend
    docker compose up -d
    ./mvnw clean package

backend-run:
    #!/usr/bin/env bash
    cd backend
    docker compose up -d
    java -jar target/backend*.jar

backend-clean:
    #!/usr/bin/env bash
    cd backend
    ./mvnw clean
    docker compose down

frontend-dev:
    #!/usr/bin/env bash
    cd frontend
    npm run dev
