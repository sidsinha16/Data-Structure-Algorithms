<h2><a href="https://leetcode.com/problems/minimum-cost-to-divide-array-into-subarrays">3500. Minimum Cost to Divide Array Into Subarrays</a></h2><h3>Hard</h3><hr><p>You are given two integer arrays, <code>nums</code> and <code>cost</code>, of the same size, and an integer <code>k</code>.</p>

<p>You can divide <code>nums</code> into <span data-keyword="subarray-nonempty">subarrays</span>. The cost of the <code>i<sup>th</sup></code> subarray consisting of elements <code>nums[l..r]</code> is:</p>

<ul>
	<li><code>(nums[0] + nums[1] + ... + nums[r] + k * i) * (cost[l] + cost[l + 1] + ... + cost[r])</code>.</li>
</ul>

<p><strong>Note</strong> that <code>i</code> represents the order of the subarray: 1 for the first subarray, 2 for the second, and so on.</p>

<p>Return the <strong>minimum</strong> total cost possible from any valid division.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [3,1,4], cost = [4,6,6], k = 1</span></p>

<p><strong>Output:</strong> <span class="example-io">110</span></p>

<p><strong>Explanation:</strong></p>
The minimum total cost possible can be achieved by dividing <code>nums</code> into subarrays <code>[3, 1]</code> and <code>[4]</code>.

<ul>
	<li>The cost of the first subarray <code>[3,1]</code> is <code>(3 + 1 + 1 * 1) * (4 + 6) = 50</code>.</li>
	<li>The cost of the second subarray <code>[4]</code> is <code>(3 + 1 + 4 + 1 * 2) * 6 = 60</code>.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [4,8,5,1,14,2,2,12,1], cost = [7,2,8,4,2,2,1,1,2], k = 7</span></p>

<p><strong>Output:</strong> 985</p>

<p><strong>Explanation:</strong></p>
The minimum total cost possible can be achieved by dividing <code>nums</code> into subarrays <code>[4, 8, 5, 1]</code>, <code>[14, 2, 2]</code>, and <code>[12, 1]</code>.

<ul>
	<li>The cost of the first subarray <code>[4, 8, 5, 1]</code> is <code>(4 + 8 + 5 + 1 + 7 * 1) * (7 + 2 + 8 + 4) = 525</code>.</li>
	<li>The cost of the second subarray <code>[14, 2, 2]</code> is <code>(4 + 8 + 5 + 1 + 14 + 2 + 2 + 7 * 2) * (2 + 2 + 1) = 250</code>.</li>
	<li>The cost of the third subarray <code>[12, 1]</code> is <code>(4 + 8 + 5 + 1 + 14 + 2 + 2 + 12 + 1 + 7 * 3) * (1 + 2) = 210</code>.</li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>cost.length == nums.length</code></li>
	<li><code>1 &lt;= nums[i], cost[i] &lt;= 1000</code></li>
	<li><code>1 &lt;= k &lt;= 1000</code></li>
</ul>
