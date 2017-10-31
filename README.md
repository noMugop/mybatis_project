1. Скачиваем проект - https://github.com/noMugop/mybatis_project
-Проект создан в Eclipse IDE for Java EE Developers) 
- https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/keplersr2

2. Если MySQL уже установлен, то пропускем данный пункт
-Если MySQL не установлен, скачиваем установщик здесь - https://dev.mysql.com/downloads/installer/
-Не забываем при установке указать Username = root, Password = root

3. Если ваши Username и Password = root, то пропускаем данный пункт:
-Заходим в MySQL Workbanch для создания нового пользователя, заходим в - Database -> Connect to Database -> вводим пароль -> жмем Ок
-В открывшемся окне, в списке слева нажимаем на "Users and Privilages"
-В открывшемся окне, снизу нажимаем "Add Account" 
-Во вкладке "Login" -> в поле Login Name, вводим логин "root" -> в поле Password, вводим пароль "root" -> в поле Confirm Password, подтверждаем пароль "root"
-Во вкладке "Administrative Roles", ставим галочку на DBA (Data Base Admin)
-Нажимаем "Apply"
 
4. В MySQL Workbanch, нужно создать новую локальную базу данных с таблицей:
-Запускаем MySQL Workbanch
-В MySQL Workbanch, заходим в - File -> Open SQL Script -> заходим в папку с проектом "Папка со скачанным проектом \ user-db \ db_scripts" запускаем файл greeting_db.sql
-После открытия скрипта, заходим в - Database -> Connect to Database -> в поле Username вводим root -> в поле Password воодим root -> нажимаем Ок
-Теперь можно нажать на желтую молнию "Execute the selected portion of the script or everything, if there is no selection"
-Поздравляю база + таблица добавленны в MySQL

5. Если нет сервера Tomcat, скачиваем его здесь - https://tomcat.apache.org/download-90.cgi -> Core -> 64-bit Windows zip (pgp, md5, sha1)

6. Запускам Eclipse -> File -> Open Project from File System -> Выбираем Directory -> Указываем путь к корневому файлу проекта -> Жмем Ок -> Finish
-В открывшемся проекте находим index.jsp -> users-db-web \ src \ main \ webapp \ index.jsp
-Щелкаем правой кнопкой по файлу -> Run As -> Run on Server -> В списке серверов выбираем Tomcat v9.0 Server (который мы скачали) -> Указываем путь к серверу (если не указан) -> Finish
-Наша страница запускается на локальном сервере, и мы видим надпись "Hellow, World!" взятую из созданной нами базы данных
-В этом можно убедится скопировав в браузер - http://localhost:8080/users-db-web/index.jsp

7. Меняем текст приветствия на странице:
-Находим в проекте mybatisUpdate.java -> users-db-dao \ src \ main \ java \ update \ mybatisUpdate.java
-Щелкаем правой кнопкой по файлу -> Run As -> Java Application
-В консоли появляется текст "Enter new greeting" 
-Вводим новый текст приветствия
-Если теперь снова повторить пункт 6 (с того места где нужно запустить index.jsp), то мы увидим, что текст приветствия изменился

8. P.S. username и password для работы с файлами, можно изменить, внеся поправки в SqlMapConfig.xml и index.jsp: (во избежании создания нового пользователя в MySQL)
-Окрываем в текстовом редакторе SqlMapConfig.xml находим строки:
<property name="username" value="root" /> 	- меняем value на свой username
<property name="password" value="root" /> 	- меняем value на свой password
-Окрываем в текстовом редакторе index.jsp находим строки:
String userId = "root";						- меняем userId на свой username
String password = "root";					- меняем password на свой password
