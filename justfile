dev: backend-dev frontend-dev

backend-dev:
    #!/usr/bin/env bash
    cd backend
    docker compose up -d
    mvn spring-boot:run

frontend-dev:
    #!/usr/bin/env bash
    cd frontend
    npm run dev

backend-clean:
    #!/usr/bin/env bash
    cd backend
    docker compose down

