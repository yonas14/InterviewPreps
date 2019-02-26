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
  if (value > this.value && this.rigth) return this.right.contains(value);
};

BinarySearchTree.prototype.min = function () {
  if (this.left === null) return this.value;
  return this.left.min;
};


BinarySearchTree.prototype.max = function () {
  if (this.right === null) return this.value;
  return this.right.max();
};

BinarySearchTree.prototype.depthFirstPrint = function (callback) {
  if (this.left) {
    callback(this.left);
    this.left.depthFirstPrint();
  }

  if (this.right) {
    callback(this.right);
    this.right.depthFirstPrint();
  }
};

BinarySearchTree.prototype.breadthFirstPrint = function (callback) {
  /**
   * for every node
   * print value
   * add node to queue
   *  add right node to quue
   *
   */

  const array = [this];
  let i = 0;
  while (i < array.length) {
    console.log(array[i].value);

    // push left child to array if left exist
    if (array[i].left) {
      array.push(array[i].left);
    }
    // push right child to array if right exist
    if (array[i].right) {
      array.push(array[i].right);
    }

    i += 1;
  }
};
