import request from '@/utils/request'
export function fetchList(params) {
  return request({
    url:'/api-user/list',
    method:'get',
    params:params
  })
}
export function userRoles(params,adminId) {
  return request({
    url:'/api-user/sys/sysUser/role/'+adminId,
    method:'get',
    params:params
  })
}
export function userRoleCheck(params) {
  return request({
    url:'/api-user/sys/sysRole/userRoleCheck',
    method:'get',
    params:params
  })
}
export function createAdmin(data) {
  return request({
    url:'/api-user/register',
    method:'post',
    data:data
  })
}
export function updateShowStatus(data) {
  return request({
    url:'/api-user/sys/sysUser/update/showStatus',
    method:'post',
    data:data
  })
}

export function updateFactoryStatus(data) {
  return request({
    url:'/api-user/sys/sysUser/update/factoryStatus',
    method:'post',
    data:data
  })
}

export function deleteAdmin(id) {
  return request({
    url:'/api-user/delete/'+id,
    method:'get',
  })
}

export function getAdmin(id) {
  return request({
    url:'/api-user/'+id,
    method:'get',
  })
}

export function updateAdmin(id,data) {
  return request({
    url:'/api-user/update/'+id,
    method:'post',
    data:data
  })
}

