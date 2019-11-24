import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '../views/layout/Layout'

/**
 * hidden: true                   if `hidden:true` will not show in the sidebar(default is false)
 * alwaysShow: true               if set true, will always show the root menu, whatever its child routes length
 *                                if not set alwaysShow, only more than one route under the children
 *                                it will becomes nested mode, otherwise not show the root menu
 * redirect: noredirect           if `redirect:noredirect` will no redirct in the breadcrumb
 * name:'router-name'             the name is used by <keep-alive> (must set!!!)
 * meta : {
    title: 'title'               the name show in submenu and breadcrumb (recommend set)
    icon: 'svg-name'             the icon show in the sidebar,
  }
 **/
export const constantRouterMap = [
  {path: '/login', component: () => import('@/views/login/index'), hidden: true},
    {path: '/reg', component: () => import('@/views/login/reg'), hidden: true},
{path: '/404', component: () => import('@/views/404'), hidden: true},
{
  path: '',
    component: Layout,
  redirect: '/home',
  children: [{
  path: 'home',
  name: 'home',
  component: () => import('@/views/home/index'),
  meta: {title: '首页', icon: 'home'}
}]
},
{
  path: '/sys',
    component: Layout,
  redirect: '/sys/user',
  name: 'sys',
  meta: {title: '系统管理', icon: 'home'},
  children: [
    {
      path: 'admin',
      name: 'admin',
      component: () => import('@/views/sys/admin/index'),
    meta: {title: '用户列表', icon: 'product-list'}
},
  {
    path: 'addAdmin',
      name: 'addAdmin',
    component: () => import('@/views/sys/admin/add'),
    meta: {title: '添加用户'},
    hidden: true
  },
  {
    path: 'updateAdmin',
      name: 'updateAdmin',
    component: () => import('@/views/sys/admin/update'),
    meta: {title: '编辑用户'},
    hidden: true
  },{
  path: 'role',
    name: 'role',
    component: () => import('@/views/sys/role/index'),
    meta: {title: '角色列表', icon: 'product-list'}
},
  {
    path: 'addRole',
      name: 'addRole',
    component: () => import('@/views/sys/role/add'),
    meta: {title: '添加角色'},
    hidden: true
  },
  {
    path: 'updateRole',
      name: 'updateRole',
    component: () => import('@/views/sys/role/update'),
    meta: {title: '编辑角色'},
    hidden: true
  }, {
  path: 'permission',
    name: 'permission',
    component: () => import('@/views/sys/permission/index'),
    meta: {title: '权限列表', icon: 'product-list'}
},
  {
    path: 'addPermission',
      name: 'addPermission',
    component: () => import('@/views/sys/permission/add'),
    meta: {title: '添加权限'},
    hidden: true
  },
  {
    path: 'updatePermission',
      name: 'updatePermission',
    component: () => import('@/views/sys/permission/update'),
    meta: {title: '编辑权限'},
    hidden: true
  }
]
}
  ,

{path: '*', redirect: '/404', hidden: true}
]

export default new Router({
  // mode: 'history', //后端支持可开
  scrollBehavior: () => ({y: 0}),
  routes: constantRouterMap
})

