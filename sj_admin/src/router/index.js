import Vue from 'vue'
import Router from 'vue-router'
import SubMenu from '@/components/SubMenu'
import ArticleList from '@/components/ArticleList'
import ImageList from '@/components/ImageList'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'SubMenu',
      component: SubMenu
    },
    {
      path: '/ilist',
      component: ImageList
    },
    {
      path: '/flist',
      component: ArticleList
    },
    {
      path: '*',
      component: SubMenu
    }
  ]
})
