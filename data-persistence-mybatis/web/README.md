# Vue 3 环境搭建指北

整理人：杨秋妍
整理时间：2021-10-03 08:09:39

---

### 1.搭建本地vue-cli环境

```
npm install -g @vue/cli
vue --version
```

> Tips  ：如果需要升级全局的vue cli

```
npm update -g @vue/cli
```

### 2.快速创建项目

```
# web ui中快速创建并启动项目
vue ui 
```

![image-20211003165115977](https://typora-pic-orange-cat.oss-cn-beijing.aliyuncs.com/img/image-20211003165115977.png)

一站式的在线创建服务

![image-20211003165234023](https://typora-pic-orange-cat.oss-cn-beijing.aliyuncs.com/img/image-20211003165234023.png)

方法二：命令创建项目

参考文档：https://cli.vuejs.org/zh/guide/creating-a-project.html#vue-create

```
vue create hello-world
```

### 3.启动

方法一：vue ui web端启动

![image-20211003165903133](https://typora-pic-orange-cat.oss-cn-beijing.aliyuncs.com/img/image-20211003165903133.png)

方法二：命令行启动

```
# npm run <项目名>
npm run hello-world
```

方法三：IDE中启动



### 4.整合Ant Design Vue

#### 步骤一： 安装

##### 方法一：ui页面直接安装

![image-20211003195542382](https://typora-pic-orange-cat.oss-cn-beijing.aliyuncs.com/img/image-20211003195542382.png)

##### 方法二：控制台

```
npm i --save ant-design-vue@next
```



#### 步骤二：引入包

```
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';
import axios from "axios"

axios.defaults.baseURL = process.env.VUE_APP_SERVER;
createApp(App).use(Antd).use(store).use(router).mount('#app')


```





### 5.一个简单demo

一个课程列表和后端交互

![image-20211003210826902](https://typora-pic-orange-cat.oss-cn-beijing.aliyuncs.com/img/image-20211003210826902.png)

```
<template>
  <a-table :columns="columns" :data-source="table" bordered>
    <template #name="{ text }">
      <a>{{ text }}</a>
    </template>
    <template #title>Header</template>
    <template #footer>Footer</template>
  </a-table>
</template>
<script lang="ts">
import {defineComponent, onMounted, ref} from 'vue';
import axios from 'axios';

const columns = [
  {
    title: 'Id',
    dataIndex: 'id',
    slots: { customRender: 'name' },
  },
  {
    title: 'loginName',
    className: 'column-money',
    dataIndex: 'loginName',
  },
  {
    title: 'name',
    dataIndex: 'name',
  },
];



export default defineComponent({
  setup() {

    const table = ref();
    const handleQuery = () => {
      axios.get("/list").then(
          (response) => {
            let data: any = [];
            data = response.data;
            console.log("data" , data);
            // if(data.success) {
              table.value = data.content;
            //}
          }
      );
    }

    onMounted(() => {
      handleQuery();
    });

    return {
      table,
      columns,
    };
  },
});
</script>
<style>
th.column-money,
td.column-money {
  text-align: right !important;
}
</style>

```

> Tips : 注意如果是前后端交互需要后端配置跨域相关内容
