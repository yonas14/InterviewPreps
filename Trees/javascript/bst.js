/* eslint-disable func-names */
function BinarySearchTree(value) {
  this.value = value;
  this.right = null;
  this.left = null;
}


// prototype - some type of inheritance

BinarySearchTree.prototype.add = function (value) {
  if (value > this.value) {
    if (this.right === null) {
      this.right = new BinarySearchTree(value);
    } else {
      this.right.add(value);
    }

    if (value < this.value) {
      if (this.left === null) {
        this.left = new BinarySearchTree(value);
      } else {
        this.left.add(value);
      }
    }
  }
};

BinarySearchTree.prototype.contains = function (value) {
  if (this.value === value) return true;
  if (value < this.value && this.left) return this.left.contains(value);
  if (value > this.value && this.rigth) return this.right.contains(value)
}

BinarySearchTree.prototype.min = function () {
  if (this.left === null) return this.value;
  return this.left.min;
};

BinarySearchTree.prototype.max() = function () {
  if (this.right = null) return this.value;
  return this.right.max()
}
