<template>
  <div class="hello">
    <Header v-bind:title="currentPosition"/>
    <table class="table">
      <tr>
        <th width="90">文章ID</th>
        <th>标题</th>
        <th width="130">更新时间</th>
        <th width="200">管理操作</th>
      </tr>
      <tr v-for="item in currentPageData" >
        <td>{{ item.id }}</td>
        <td style="text-align:left;padding-left:10px;padding-right:10px;line-height:30px">{{ item.title }}</td>
        <td>{{ item.update }}</td>
        <td>
          <button class="button" style="background:#17b599">修改</button>
          <button class="button" style="background:#18afff">预览</button>
          <button class="button" style="background:#de0101">删除</button>
        </td>
        
      </tr>
    </table>
    <Pagination :max="amountOfPage" v-on:change="refresh"/>
  </div>
</template>

<script>
import Header from './xHeaderLocation';
import Pagination from './xPagination';
export default {
  name: 'SubMenu',
  components: {
    Header,Pagination
  },
  data () {
    return {
      currentPosition: '文章管理 > 首页 > ' + this.$route.query.to,
      amountPerPage: 20,
      parts: [
        {
          id: '23800',
          title: '我校在全国大学生数学建模竞赛中获得优异成绩',
          color: '#18afff',
          update: '2018-01-01'
        },
        {
          id: '23800',
          title: '数计学院在第八届“蓝桥杯” 全国软件和信息技术专业人才大赛省赛中喜获佳绩',
          color: '#18afff',
          update: '2018-01-02'
        },
        {
          id: '23800',
          title: '我校在全国大学生数学建模竞赛中获得优异成绩',
          color: '#18afff',
          update: '2018-01-03'
        },
        {
          id: '23800',
          title: '我校在全国大学生数学建模竞赛中获得优异成绩',
          color: '#18afff',
          update: '2018-01-04'
        },
        {
          id: '23800',
          title: '我校在全国大学生数学建模竞赛中获得优异成绩',
          color: '#18afff',
          update: '2018-01-05'
        },
        {
          id: '23800',
          title: '我校在全国大学生数学建模竞赛中获得优异成绩',
          color: '#18afff',
          update: '2018-01-06'
        }
      ],
      currentPageData:[],
      amountOfPage: 0
    }
  },
  mounted: function() {
    if(this.$route.query.to === "student-work") {
      this.currentPosition = "文章管理 > 首页 > 学生工作";
    } else if(this.$route.query.to === "faculty-news") {
      this.currentPosition = "文章管理 > 首页 > 学院新闻";
    } else if(this.$route.query.to === "public-inform") {
      this.currentPosition = "文章管理 > 首页 > 公告公示";
    } else if(this.$route.query.to === "activity-express") {
      this.currentPosition = "文章管理 > 首页 > 活动快讯";
    } else if(this.$route.query.to === "party-work") {
      this.currentPosition = "文章管理 > 首页 > 党建工作";
    }
    this.amountOfPage = Math.ceil(this.parts.length / this.amountPerPage);
    var i=0;
    while(i<this.amountPerPage && i<this.parts.length) {
      this.currentPageData[i] = this.parts[i];
      i++;
    }
  },
  methods: {
    refresh: function(arg) {
      var top = (arg-1) * this.amountPerPage;
      var i = top;
      //this.currentPageData.length = 0;
      this.currentPageData.splice(0,this.currentPageData.length);
      while(i < top + this.amountPerPage && i < this.parts.length) {
        this.currentPageData[i-top] = this.parts[i];
        i++;
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
* {
  font-family:'Microsoft Yahei',Arial, Helvetica, sans-serif;
}

.hello {
  background-color: #e4e8eb;
  text-align: left;
}

.table {
  background-color: #e9f3f2;
  border: 1px #d3e8e6 solid;
  border-collapse: collapse;
  font-size: 18px;
  line-height: 40px;
  margin-top: 20px;
  margin-left: 20px;
  width: calc(100% - 40px);
}

.table tr,td{
  border: 1px #d3e8e6 solid;
  text-align: center;
}

.table th {
  text-align: center;
  font-size: 18px;
}

.table tr:nth-child(even) {
    background-color: #fff;
}

.amount {
  text-align: center;
  width: 140px;
  color: #b0b0b0;
  font-size: 26px;
  margin: 0;
  vertical-align: middle;
}

.button {
  height: 30px;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  color: #fff;
  margin-left: 5px;
  margin-right: 5px;
}
</style>
  