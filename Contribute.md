# Contribution

___

1. Added mysql connector dependency and removed unused dependency
2. Change application.yml— removed flyway configuration
3. Made a separate class `DatabaseConfig` for creating schema and adding data to a database.
4. Changed the table name in `Student` class `"student"` to `"students"`.
5. Created `FindStudentController` to separate the searching controller operations.
6. Added 2 methods to `StudentRepository` and `StudentServices` .