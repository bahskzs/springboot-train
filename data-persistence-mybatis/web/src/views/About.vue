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
