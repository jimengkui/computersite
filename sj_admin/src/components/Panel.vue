<template>
  <div class="panel">
    <img src="../assets/logo.png" class="logo">
    <h1>数学与计算机学院<br>后台管理</h1>
    <li class="menu">
    <img src="../assets/iconArticle.png">
      <p>文章管理</p>
    </li>
    <li class="menu">
      <img src="../assets/iconHomepage.png">
      <p>首页</p>
    </li>
    <li class="submenu" v-for="item in submenu">
      <p v-text="item"></p>
    </li>
    <li class="menu">
      <img src="../assets/iconAccount.png">
      <p>账号管理</p>
    </li>
    <li class="menu">
      <img src="../assets/iconPublish.png">
      <p>发布文章</p>
    </li>
    <li class="menu" style="position:absolute;bottom:0;left:0;width:200px;">
      <img src="../assets/iconSignOut.png">
      <p>退出登录</p>
    </li>
  </div>
</template>

<script>
export default {
  name: 'Panel',
  data () {
    return {
      submenu: [
        '学院概况',
        '人才培养',
        '科学教研',
        '师资力量',
        '工会工作',
        '创新创业'
      ]
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}

.panel {
  width: 200px;
  height: 100%;
  background-color: #17b69a;
  text-align: left;
}

.logo {
  width: 40px;
  height: 40px;
  display: inline-block;
  margin-left: 10px;
  margin-right: 10px;
  vertical-align: middle;
  line-height: 60px;
}

.menu {
  display:block;
  color: #ebebeb;
  
  font-size: 20px;
  text-align: left;
  line-height: 30px;
  width: 100%;
  margin:0;
  margin-top:4px;
  margin-bottom: 4px;
  cursor: default;
}

.menu:hover {
  background-color: #329987;
  color:#fff;
}

.submenu {
  display:block;
  color:#fff;
  font-size: 18px;
  text-align: left;
  width: 100%;
  margin:0;
  padding:10px;
  padding-left: 60px;
  cursor: default;
}

.submenu p {
  margin: 0;
}

.submenu:hover {
  background-color: #329987;
  color:#fff;
}

h1 {
  font-weight: bold;
  font-size: 14px;
  font-family:'Microsoft Yahei',Arial, Helvetica, sans-serif;
  color: white;
  text-align: center;
  margin: 0;
  display: inline-block;
  height: 48px;
  vertical-align: middle;
  margin-top: 12px;
}

.menu p {
  margin:10px; 
  text-align: left;
  display: inline-block;
  vertical-align: middle;
  line-height: 30px;
}
.menu img{
  display: inline-block;
  vertical-align: middle;
  line-height: 30px;
  margin-left: 40px;
}


</style>
