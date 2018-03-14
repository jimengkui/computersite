<template>
  <div id="app">
    <panel class="panel"/><router-view class="container"/>
  </div>
</template>

<script>
import Panel from './components/Panel'

export default {
  name: 'App',
  components: {
    Panel
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  height: 100%;
}
.panel {
  display: inline-block;
  margin: 0;
}
.container {
  display: inline-block;
  width: calc(100% - 200px);
  vertical-align: top;
  height:100%;
  overflow: hidden;
}
</style>
