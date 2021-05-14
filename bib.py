import pymysql.cursors

surname_list = 'Смирнов Иванов Кузнецов Соколов Попов Лебедев Козлов Новиков Морозов Петров Волков Соловьёв Васильев' \
               ' Зайце Павлов Семёнов Голубев Виноградов Богданов Воробьёв Фёдоров Михайлов Беляев Тарасов Белов' \
               ' Комаров Орлов Киселёв Макаров Андреев Ковалёв Ильин Гусев Титов Кузьмин Кудрявцев Баранов Куликов' \
               ' Алексеев Степанов Яковлев Сорокин Сергеев Романов Захаров Борисов Королёв Герасимов Пономарёв' \
               ' Григорьев'.split()

name_list = 'Алексей Владислав Авдей Натан Серафим Андриян Ерофей Руслан Даниил Адам Аскольд ЯкубЕфрем Михаил' \
            ' Игнати Артем Олег Максим Станислав Феликс Роман Тит Фадей Вениамин Сократ Ипатий Андрон Никита' \
            ' Харитон Мстислав Максимильян Гаврила Евгений Савелий Аристарх Юлиан ЕфимПотап Вячеслав Никанор' \
            ' Пахом Агафон Рубен Ян Иннокентий Евсей Емельян Филимон Афанасий Парфен Василий' \
            ' Евгений'.split()

# подключение к серверу
connection = pymysql.connect(host='127.0.0.1',
                             user='root',
                             password='helloworld')
# блок кода, отвечающий за удаление старой БД с именем student_bd, если такая существовала (опционально)
try:
    connection.cursor().execute("""DROP DATABASE student_db""")
except:
    pass
# создание БД с именем student_db
# создание таблицы с именем students в student_bd
create = """CREATE DATABASE IF NOT EXISTS student_db;
            USE student_db;
            CREATE TABLE IF NOT EXISTS students(
            `studentID` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
            `studentName` VARCHAR(30) NOT NULL,
            `studentSurname` VARCHAR(30) NOT NULL);"""
for element in create.split(';'):
    try:
        connection.cursor().execute(element)
        connection.commit()
    except:
        pass

connection.close()
# подключаемся к созданной БД
connection = pymysql.connect(host='localhost',
                          user='root',
                          password='helloworld',
                          db='student_db',
                          charset='utf8mb4',
                          cursorclass=pymysql.cursors.DictCursor)
# заполняем таблицу students
with connection.cursor() as cursor:
    cursor.execute("SHOW tables")
    print(cursor.fetchall())

    for i in range(0, len(surname_list)):
        cursor.execute(f"insert into students value(NULL, '{name_list[i]}', '{surname_list[i]}')")

    # вывод заполненной таблицы
    cursor.execute("select * from students;")
    print(cursor.fetchall())
connection.commit()
# обновим для примера некоторые данные и еще раз выведем таблицу
with connection.cursor() as cursor:
    cursor.execute("update students set studentName = 'Николай', studentSurname = 'Басков'  where studentID = 3;")
    cursor.execute("select * from students;")
    print(cursor.fetchall())
    # отдельно выведем строку с измененными данными
    cursor.execute("select * from students WHERE studentID = 3;")
    print(cursor.fetchall())
connection.commit()

connection.close()
