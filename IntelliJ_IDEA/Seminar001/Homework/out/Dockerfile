FROM eclipse-temurin:17-jdk-jammy
COPY ./ ./src
RUN javac -sourcepath ./src -d out src/ru/gb/PointOfEntry/Main.java
CMD ["java", "-classpath ./out ru.gb.PointOfEntry.Main"]