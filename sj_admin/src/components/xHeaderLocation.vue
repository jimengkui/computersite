<template>
    <div class="header">
      <img src="../assets/iconLeftAlign.png" class="iconLeftAlign">
      <router-link to="/" title="返回上一级"><p class="position" v-text="title"></p></router-link>
    </div>
</template>

<script>
export default {
  name: 'xHeaderLocation',
  props: ['title'],
  data () {
    return {
      
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
* {
  font-family:'Microsoft Yahei',Arial, Helvetica, sans-serif;
}

.header {
  background-color: white;
  height: 60px;
  width: 100%;
  text-align: left;
}

.iconLeftAlign {
  margin: 0px;
  margin-left: 20px;
  margin-right: 10px;
  vertical-align: middle;
  line-height: 60px;
  display: inline-block;
}

.position {
  display:inline-block;
  line-height: 60px;
  font-weight: bold;
  font-size: 22px;
  margin: 0;
  vertical-align: middle;
  cursor: pointer;
  color: #000;
}
</style>
  