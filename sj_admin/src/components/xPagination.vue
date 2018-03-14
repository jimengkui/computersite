<template>
    <div class="header">
      <section>
      <img src="../assets/iconArrowLeft.png" v-if="visibleLeft" v-on:click="minus" class="iconLeftAlign">
      </section>
      <p>{{ currentPageNumber }}</p>
      <section>
      <img src="../assets/iconArrowRight.png" v-if="visibleRight" v-on:click="plus" class="iconLeftAlign">
      </section>
    </div>
</template>

<script>
export default {
  name: 'xHeaderLocation',
  props: ['max'],
  data () {
    return {
      currentPageNumber: 1,
      visibleLeft: 0,
      visibleRight: 1
    }
  },
  methods: {
    minus() {
      if(this.currentPageNumber != 1) {
        this.currentPageNumber --;
      }
    },
    plus() {
      if(this.currentPageNumber != this.max) {
        this.currentPageNumber ++;
      }
    }
  },
  watch: {
    currentPageNumber: function(val,_val) {
      this.$emit("change",val);
              this.visibleLeft = 1;
        this.visibleRight = 1;
      if(val === 1) {
        this.visibleLeft = 0;
      } 
      if(val == this.max) {
        this.visibleRight = 0;
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

.header {
  height: 30px;
  width: inherit;
  text-align: center;
  position: absolute;
  bottom: 40px;
  cursor: default;
}

.header section {
  display: inline-block;
  width: 36px;
}

p {
  background-color: #17b599;
  height: 30px;
  width: 30px;
  text-align: center;
  line-height: 30px;
  color: #fff;
  display: inline-block;
}

.iconLeftAlign {
  margin: 0px;
  vertical-align: middle;
  line-height: 30px;
  height: 17px;
  width: 10px;
  display: inline-block;
  cursor: pointer;
}
</style>
  