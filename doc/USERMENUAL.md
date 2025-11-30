## 사용법

### Docker (Powershell or Ubuntu Server)

docker-compose.yml 파일이 있는 위치에서 실행

#### 빌드 및 실행
```bash
# 빌드 후 실행
docker-compose up --build

# 백그라운드 실행
docker-compose up -d --build

# 빌드 없이 실행 (이미 빌드된 경우)
docker-compose up -d
```

#### 중지 및 삭제
```bash
# 컨테이너 중지
docker-compose stop

# 컨테이너 중지 및 삭제
docker-compose down

# 컨테이너, 네트워크, 볼륨 모두 삭제
docker-compose down -v
```

#### 로그 조회
```bash
# 전체 로그 조회
docker-compose logs

# 실시간 로그 조회
docker-compose logs -f

# 최근 100줄 로그 조회
docker-compose logs --tail 100
```

### Java Maven (Ubuntu)
1. mvn clean package
2. mvn spring-boot:run
 
