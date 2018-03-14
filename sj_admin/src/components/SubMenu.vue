<template>
  <div class="hello">
    <Header v-bind:title="currentPosition"/>
    <div class="part" v-for="item in parts">
      <div class="part_left" v-bind:style="{ background : item.color }">
        <span v-text="item.title"></span>
      </div><p class="amount">{{ item.amount }}<br>篇</p>
      <div class="dark_layer">
        <img src="../assets/iconSettings.png">
        <router-link v-bind:to="{path:item.target,query: {to: item.param}}"><span>管理</span></router-link>
      </div>
    </div>
  </div>
</template>

<script>
import Header from './xHeaderLocation'
export default {
  name: 'SubMenu',
  components: {
    Header
  },
  data () {
    return {
      currentPosition: '文章管理 > 首页',
      parts: [
        {
          color: '#18afff',
          amount: 5,
          title: '活动展示',
          target: '/ilist',
          param: 'activity-show'
        },
        {
          color: '#ff6c5e',
          amount: 163,
          title: '学院新闻',
          target: '/flist',
          param: 'faculty-news'
        },
        {
          color: '#f8d445',
          amount: 163,
          title: '公告公示',
          target: '/flist',
          param: 'public-inform'
        },
        {
          color: '#ad90f0',
          amount: 163,
          title: '活动快讯',
          target: '/flist',
          param: 'activity-express'
        },
        {
          color: '#ffb86b',
          amount: 163,
          title: '党建工作',
          target: '/flist',
          param: 'party-work'
        },
        {
          color: '#aad575',
          amount: 12,
          title: '学生工作',
          target: '/flist',
          param: 'student-work'
        },
      ]
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
* {
  font-family:'Microsoft Yahei',Arial, Helvetica, sans-serif;
}

li {
  display: inline-block;
  margin: 0 10px;
}
a {
  text-decoration: none;
}
.hello {
  background-color: #e4e8eb;
  text-align: left;
}

.part {
  background-color: #fff;
  border-radius: 5px;
  width: 250px;
  height: 110px;
  text-align: left;
  display: inline-block;
  margin-left: 50px;
  margin-top: 40px;
}

/**/

.part p { 
  display: inline-block;
}

.dark_layer {
  background-color: rgba(0,0,0,0.66);
  position: relative;
  top: -110px;
  height: 110px;
  border-radius: 5px;
  opacity: 0;
}

.dark_layer:hover {
  opacity: 1;
}

.dark_layer img {
  position: relative;
  top:32px;
  left:32px;
  cursor: pointer;
}

.dark_layer span {
  position: relative;
  top:24px;
  left: 95px;
  font-size: 32px;
  color: #fff;
  cursor: pointer;
}

.part_left {
  width: 110px;
  height: 110px;
  border-top-left-radius: 5px;
  border-bottom-left-radius: 5px;
  display: inline-block;
  text-align: center;
}

.part_left span {
  color: white;
  font-weight: normal;
  font-size: 22px;
  line-height: 110px;
}

.amount {
  text-align: center;
  width: 140px;
  color: #b0b0b0;
  font-size: 26px;
  margin: 0;
  vertical-align: middle;
}
</style>
  