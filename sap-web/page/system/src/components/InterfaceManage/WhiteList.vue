<template>
  <div class="buleTable">
    <el-table ref="multipleTable"
              :data="tableData3"
              tooltip-effect="dark"
              style="width: 100%"
              @selection-change="handleSelectionChange" border>
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column prop="name" label="ip地址"></el-table-column>
      <el-table-column prop="name" label="是否启用"></el-table-column>
      <el-table-column prop="name" label="备注"></el-table-column>
      <el-table-column prop="name" label="创建时间"></el-table-column>
      <el-table-column prop="name" label="创建人"></el-table-column>
      <el-table-column label="操作" width="200">
        <template slot-scope="scope">
          <el-button @click="onDoAddWhite(scope.row)" type="text" size="small">修改</el-button>
          <el-button @click="onDoOpen(scope.row)" type="text" size="small">启用</el-button>
          <el-button @click="onDoClose(scope.row)" type="text" size="small" style="color: red;">禁用</el-button>
          <el-button @click="onDoDeteleWhite(scope.row)" type="text" size="small" style="color: red;">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
export default {
  props: {
    onSelectData: Function,
    onDoOpen: Function,
    onDoClose: Function,
    onDoDeteleWhite: Function,
    onDoAddWhite: Function
  },
  data() {
    return {
      tableData3: [{
        name: '王小虎'
      },{
        name: '王小虎'
      }]
    }
  },
  methods: {
    handleSelectionChange(val) {
      this.onSelectData(val)
    }
  }
}
</script>

