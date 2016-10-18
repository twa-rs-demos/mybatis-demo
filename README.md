# mybatis-demo

## 配置环境
### 安装 MySQL 　
`sudo apt install mysql-server`，具体可以参考 [这里](https://help.ubuntu.com/16.04/serverguide/mysql.html)　
> `注意：` 请记住 mysql 的 root 密码

## 初始化数据库
1. [~] $: cd mybatis-demo
2. [mybatis-demo] $: ./db-initial.sh （需要输入 mysql root 的密码）
3. 修改 mysql 密码：将 src/main/resources/config.properties 中的 password 一项的值修改为你自己的 mysql root 密码


看到如下输出，表示数据库初始化成功
```shell
id name   gender
1  Bulma  female
2  Vegeta male
3  ChiChi female
4  Goku   male
```

##  运行 demo
1. [~] $: cd mybatis-demo
2. [mybatis-demo] $: ./gradlew -q run

此时，在控制台下应该可以看到类似如下的输出：  
```shell
[mybatis-demo]$ gradle -q run
User{id=1, name='Bulma', gender='female'}
User{id=2, name='Vegeta', gender='male'}
User{id=3, name='ChiChi', gender='female'}
User{id=4, name='Goku', gender='male'}
```
> `注意：`第一次运行 ./gradlew -q run，项目会下载安装 `gradle`，花费比较长的时间

