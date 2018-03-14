<template>
  <div class="hello">
    <Header v-bind:title="currentPosition"/>
    <div class="part" v-for="item in currentPageData" :key="item.title">
      <img class="show" src="../assets/imageExample_01.png">
      <div class="part_bottom">
        <h2 v-text="item.title"></h2>
        <hr />
        <p v-text="item.date"></p>
        <button class="button" style="background:#17b599">修改</button>
        <button class="button" style="background:#18afff">预览</button>
        <button class="button" style="background:#de0101">删除</button>
      </div>
    </div>
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
      fullHeight: document.documentElement.clientHeight,
      fullWidth: document.documentElement.clientWidth,
      amountPerPage: Math.floor((document.documentElement.clientHeight-60-70)/350)*Math.floor(((document.documentElement.clientWidth-200)/310)),
      parts: [
        {
          color: '#18afff',
          date: '2017-01-01',
          title: '十九大代表陈小花来校宣讲党的十九大精神'
        },
        {
          color: '#ff6c5e',
          date: '2017-01-02',
          title: '十九大代表陈小花来校宣讲党的十九大精神'
        },
        {
          color: '#f8d445',
          date: '2017-01-03',
          title: '十九大代表陈小花来校宣讲党的十九大精神'
        },
        {
          color: '#ad90f0',
          date: '2017-01-04',
          title: '十九大代表陈小花来校宣讲党的十九大精神'
        },
        {
          color: '#ffb86b',
          date: '2017-01-05',
          title: '十九大代表陈小花来校宣讲党的十九大精神'
        },
        {
          color: '#aad575',
          date: '2017-01-06',
          title: '十九大代表陈小花来校宣讲党的十九大精神'
        },
      ],
      currentPageData:[],
      amountOfPage: 0
    }
  },
  mounted: function() {
    this.amountOfPage = Math.ceil(this.parts.length / this.amountPerPage);
    if(this.$route.query.to === "activity-show") {
      this.currentPosition = "文章管理 > 首页 > 活动展示";
    }
    var i=0;
    while(i<this.amountPerPage && i<this.parts.length) {
      this.currentPageData[i] = this.parts[i];
      i++;
      //Vue.set(this.currentPageData,i,this.parts[i]);
    }
    //alert();
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

hr {
  width: 70%;
  margin:0 auto;
}

.part {
  background-color: #fff;
  width: 270px;
  height: 320px;
  text-align: left;
  display: inline-block;
  margin-left: 40px;
  margin-top: 30px;
  overflow: hidden;
}

/**/

.part p { 
  display: inline-block;
}

.part_bottom {
  width: 270px;
  height: 150px;
  display: inline-block;
  text-align: center;
  margin: 0;
  position: relative;
  top: -154px;
  background-color: rgba(255,255,255,0.93);
}

.part_bottom h2 {
  color: #000;
  font-weight: normal;
  font-size: 16px;
  margin-top: 15px;
  margin-bottom: 10px;
  font-family: "SimSun";
  text-align: center;
  padding-left: 36px;
  padding-right: 36px;
  line-height: 22px;
}

.part_bottom p {
  display: block;
  margin: 0;
  margin-top: 5px;
  margin-bottom: 10px;
}

.show {
  width: 100%;
  height:100%;
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
  