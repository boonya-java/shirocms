DELIMITER ;
delete from sys_user;
delete from sys_app;
delete from sys_user_app_roles;
delete from sys_role;
delete from sys_resource;
delete from sys_organization;

insert into sys_user values(1,1,'admin','d3c59d25033dbf980d29554025c23a75','8d78869f470951332959580424d4bf4f', false);
insert into sys_app values(1, '中心服务器', '645ba616-370a-43a8-a8e0-993e7a590cf0', 'bb74abb6-bae0-47dd-a7b1-9571ea3a0f33', true);
insert into sys_app values(2, 'APP-1', '645ba612-370a-43a8-a8e0-993e7a590cf0', 'bb74abb2-bae0-47dd-a7b1-9571ea3a0f33', true);
insert into sys_app values(3, 'APP-2', '645ba613-370a-43a8-a8e0-993e7a590cf0', 'bb74abb3-bae0-47dd-a7b1-9571ea3a0f33', true);

insert into sys_user_app_roles values(1, 1, 1, '1');
insert into sys_user_app_roles values(2, 1, 2, '1,2');
insert into sys_user_app_roles values(3, 1, 3, '1,3');

insert into sys_organization values(1, '总公司', 0, '0/', true);
insert into sys_organization values(2, '分公司1', 1, '0/1/', true);
insert into sys_organization values(3, '分公司2', 1, '0/1/', true);
insert into sys_organization values(4, '分公司11', 2, '0/1/2/', true);

INSERT INTO `sys_resource` VALUES ('1', '资源', 'root', '', '0', '0/', '', '1');

INSERT INTO `sys_resource` VALUES ('2', '系统管理', 'category', null, '1', '0/1/', '', '1');
INSERT INTO `sys_resource` VALUES ('3', '基础管理', 'category', null, '1', '0/1/', '', '1');
INSERT INTO `sys_resource` VALUES ('4', '广告管理', 'category', null, '1', '0/1/', '', '1');
INSERT INTO `sys_resource` VALUES ('5', '支付管理', 'category', null, '1', '0/1/', null, '1');
INSERT INTO `sys_resource` VALUES ('6', '订单管理', 'category', null, '1', '0/1/', null, '1');
INSERT INTO `sys_resource` VALUES ('7', '商品管理', 'category', null, '1', '0/1/', null, '1');
INSERT INTO `sys_resource` VALUES ('8', '运输管理', 'category', null, '1', '0/1/', null, '1');
INSERT INTO `sys_resource` VALUES ('9', '财务管理', 'category', null, '1', '0/1/', null, '1');
INSERT INTO `sys_resource` VALUES ('10', '招聘管理', 'category', null, '1', '0/1/', null, '1');

INSERT INTO `sys_resource` VALUES ('11', '组织机构管理', 'menu', '/organization', '2', '0/1/2/', 'organization:*', '1');
INSERT INTO `sys_resource` VALUES ('12', '组织机构新增', 'button', '', '11', '0/1/2/11/', 'organization:create', '1');
INSERT INTO `sys_resource` VALUES ('13', '组织机构修改', 'button', '', '11', '0/1/2/11/', 'organization:update', '1');
INSERT INTO `sys_resource` VALUES ('14', '组织机构删除', 'button', '', '11', '0/1/2/11/', 'organization:delete', '1');
INSERT INTO `sys_resource` VALUES ('15', '组织机构查看', 'button', '', '11', '0/1/2/11/', 'organization:view', '1');

INSERT INTO `sys_resource` VALUES ('16', '应用管理', 'menu', '/app', '2', '0/1/2/', 'app:*', '1');
INSERT INTO `sys_resource` VALUES ('17', '应用新增', 'button', '', '16', '0/1/2/16/', 'app:create', '1');
INSERT INTO `sys_resource` VALUES ('18', '应用修改', 'button', '', '16', '0/1/2/16/', 'app:update', '1');
INSERT INTO `sys_resource` VALUES ('19', '应用删除', 'button', '', '16', '0/1/2/16/', 'app:delete', '1');
INSERT INTO `sys_resource` VALUES ('20', '应用查看', 'button', '', '16', '0/1/2/16/', 'app:view', '1');

INSERT INTO `sys_resource` VALUES ('21', '用户管理', 'menu', '/user', '2', '0/1/2/', 'user:*', '1');
INSERT INTO `sys_resource` VALUES ('22', '用户新增', 'button', '', '21', '0/1/2/21/', 'user:create', '1');
INSERT INTO `sys_resource` VALUES ('23', '用户修改', 'button', '', '21', '0/1/2/21/', 'user:update', '1');
INSERT INTO `sys_resource` VALUES ('24', '用户删除', 'button', '', '21', '0/1/2/21/', 'user:delete', '1');
INSERT INTO `sys_resource` VALUES ('25', '用户查看', 'button', '', '21', '0/1/2/21/', 'user:view', '1');

INSERT INTO `sys_resource` VALUES ('31', '资源管理', 'menu', '/resource', '2', '0/1/2/2/', 'resource:*', '1');
INSERT INTO `sys_resource` VALUES ('32', '资源新增', 'button', '', '31', '0/1/2/31/', 'resource:create', '1');
INSERT INTO `sys_resource` VALUES ('33', '资源修改', 'button', '', '31', '0/1/2/31/', 'resource:update', '1');
INSERT INTO `sys_resource` VALUES ('34', '资源删除', 'button', '', '31', '0/1/2/31/', 'resource:delete', '1');
INSERT INTO `sys_resource` VALUES ('35', '资源查看', 'button', '', '31', '0/1/2/31/', 'resource:view', '1');

INSERT INTO `sys_resource` VALUES ('41', '角色管理', 'menu', '/role', '2', '0/1/2/', 'role:*', '1');
INSERT INTO `sys_resource` VALUES ('42', '角色新增', 'button', '', '41', '0/1/2/41/', 'role:create', '1');
INSERT INTO `sys_resource` VALUES ('43', '角色修改', 'button', '', '41', '0/1/2/41/', 'role:update', '1');
INSERT INTO `sys_resource` VALUES ('44', '角色删除', 'button', '', '41', '0/1/2/41/', 'role:delete', '1');
INSERT INTO `sys_resource` VALUES ('45', '角色查看', 'button', '', '41', '0/1/2/41/', 'role:view', '1');

INSERT INTO `sys_resource` VALUES ('51', '授权管理', 'menu', '/authorization', '2', '0/1/2/', 'authorization:*', '1');
INSERT INTO `sys_resource` VALUES ('52', '授权新增', 'button', '', '51', '0/1/2/51/', 'authorization:create', '1');
INSERT INTO `sys_resource` VALUES ('53', '授权修改', 'button', '', '51', '0/1/2/51/', 'authorization:update', '1');
INSERT INTO `sys_resource` VALUES ('54', '授权删除', 'button', '', '51', '0/1/2/51/', 'authorization:delete', '1');
INSERT INTO `sys_resource` VALUES ('55', '授权查看', 'button', '', '51', '0/1/2/51/', 'authorization:view', '1');

insert into sys_role values(1, 'admin', '超级管理员', '11,16,21,31,41,51', true);
insert into sys_role values(2, 'role1', 'APP1管理员', '11,16,21,31,41,51', true);
insert into sys_role values(3, 'role2', 'APP2管理员', '11,16,21,31,41,51', true);