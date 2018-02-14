"# HumanAssistanst" 
<h1>HumanAssistanst</h1><br>
 โปรเจคนี้เป็นส่วนหนึ่งของวิชา<br>
 INT206 Software Process Management II<br>

  
 ## Getting Started
 เข้ามาใน GitHub Log in เข้าสู่ระบบหลังจากที่ได้ทำการ invite collaborators(คนที่สามารถแก้ไขไฟล์ต่างๆ)มาแล้วโดยผู้ที่สร้าง Repository ขึ้นมา
 ก็จะต้องทำการ Clone Project เพื่อให้ทุกคนได้ไฟล์จากโปรเจคมาเหมือนๆกัน และจะต้องทำการลงโปรแกรมหรืออุปกรณ์ที่จำเป็นต่อการทำโปรเจค ดังนี้
  
 ### 1. Apache Maven
 Download : http://maven.apache.org/download.cgi 
 ```
 $ cd HelloWorldProject
 $ mvn clean install
 ```
 ใช้งานผ่าน Plugin ของ IDE เพื่อช่วยในการ config dependencies ในไฟล์ pom.xml และทำให้สามารถเรียกใช้ Plugin ต่างๆได้ <br/>
 
 ### 2. Apache Tomcat  
 
 Download : https://tomcat.apache.org/download-80.cgi   
 หลังจากที่ Download มาเแล้วก็ต้องทำการติดตั้งและเพิ่ม Server Apache Tomcat เข้าไปใน Netbeans จากนั้นทำการตั้ง Username และ Password
 
 ### 3. MySQL Community Server 5.7
 * [Windows]  
Download : https://dev.mysql.com/downloads/windows/installer/5.7.html  
 
 * [MacOS]  
 Download : https://dev.mysql.com/downloads/mysql/  
 (ที่ Select platform: เลือกเป็น Mac OS X จากนั้นเลือกตัวติดตั้งแบบ dmg)  
 ทำการแก้ไขไฟล์ .bash_profile
 ```bash
 # Add MySQL 
 export MYSQL_ROOT=/usr/local/mysql 
 export PATH=$MYSQL_ROOT/bin:$PATH
 ```
 เปิดโปรแกรม terminal แล้วพิมพ์คำสั่ง  
 
 ```bash
 mysql -u root -p
 ```
 ตัว terminal จะแสดง Enter password: ให้ใส่ temporary password ที่ได้มา
 และตั้งค่ารหัสใหม่ โดยใช้คำสั่ง  
 
 ```bash
 SET PASSWORD = PASSWORD('รหัสผ่านที่ต้องการ'); 
 ```
  )
 
 # Config Properties
 สร้างไฟล์ config.properties ใน /src/main/resoures โดยใส่
 
 ```bash
 dburl=${databaseURL}
 dbuser=${databaseUsername}
 dbpassword= ${databasePassword}
 
 
 +## Members
 57130500032 ธนศักดิ์ ไชยบุตร  <br>
 58130500067 วิวิศน์ ลิขิตเจริญพันธ์ <br>
 58130500068 วิศิษฐ์ หลวงสนาม <br>
 58130500077 สิทธิชัย การยสิทธิ์ <br>
 58130500076 สรศักดิ์ จ่าเพ็ง <br>
 581305000103 กฤษฎา ดิฐพิพัฒน์กุล <br>
 58130500118 ปณชัย ปิยะสกุลเลิศ <br>
