package com.myschool.hdfs.adapter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"accessTime",
	"blockSize",
	"childrenNum",
	"fileId",
	"group",
	"length",
	"modificationTime",
	"owner",
	"pathSuffix",
	"permission",
	"replication",
	"storagePolicy",
	"type"
})
public class FileStatusProperties {

	@JsonProperty("accessTime")
	private Long accessTime;
	@JsonProperty("blockSize")
	private Integer blockSize;
	@JsonProperty("childrenNum")
	private Integer childrenNum;
	@JsonProperty("fileId")
	private Integer fileId;
	@JsonProperty("group")
	private String group;
	@JsonProperty("length")
	private Integer length;
	@JsonProperty("modificationTime")
	private Long modificationTime;
	@JsonProperty("owner")
	private String owner;
	@JsonProperty("pathSuffix")
	private String pathSuffix;
	@JsonProperty("permission")
	private String permission;
	@JsonProperty("replication")
	private Integer replication;
	@JsonProperty("storagePolicy")
	private Integer storagePolicy;
	@JsonProperty("type")
	private String type;

	@JsonProperty("accessTime")
	public Long getAccessTime() {
		return accessTime;
	}

	@JsonProperty("accessTime")
	public void setAccessTime(Long accessTime) {
		this.accessTime = accessTime;
	}

	@JsonProperty("blockSize")
	public Integer getBlockSize() {
		return blockSize;
	}

	@JsonProperty("blockSize")
	public void setBlockSize(Integer blockSize) {
		this.blockSize = blockSize;
	}

	@JsonProperty("childrenNum")
	public Integer getChildrenNum() {
		return childrenNum;
	}

	@JsonProperty("childrenNum")
	public void setChildrenNum(Integer childrenNum) {
		this.childrenNum = childrenNum;
	}

	@JsonProperty("fileId")
	public Integer getFileId() {
		return fileId;
	}

	@JsonProperty("fileId")
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	@JsonProperty("group")
	public String getGroup() {
		return group;
	}

	@JsonProperty("group")
	public void setGroup(String group) {
		this.group = group;
	}

	@JsonProperty("length")
	public Integer getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(Integer length) {
		this.length = length;
	}

	@JsonProperty("modificationTime")
	public Long getModificationTime() {
		return modificationTime;
	}

	@JsonProperty("modificationTime")
	public void setModificationTime(Long modificationTime) {
		this.modificationTime = modificationTime;
	}

	@JsonProperty("owner")
	public String getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@JsonProperty("pathSuffix")
	public String getPathSuffix() {
		return pathSuffix;
	}

	@JsonProperty("pathSuffix")
	public void setPathSuffix(String pathSuffix) {
		this.pathSuffix = pathSuffix;
	}

	@JsonProperty("permission")
	public String getPermission() {
		return permission;
	}

	@JsonProperty("permission")
	public void setPermission(String permission) {
		this.permission = permission;
	}

	@JsonProperty("replication")
	public Integer getReplication() {
		return replication;
	}

	@JsonProperty("replication")
	public void setReplication(Integer replication) {
		this.replication = replication;
	}

	@JsonProperty("storagePolicy")
	public Integer getStoragePolicy() {
		return storagePolicy;
	}

	@JsonProperty("storagePolicy")
	public void setStoragePolicy(Integer storagePolicy) {
		this.storagePolicy = storagePolicy;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileStatusProperties [accessTime=").append(accessTime).append(", blockSize=").append(blockSize)
				.append(", childrenNum=").append(childrenNum).append(", fileId=").append(fileId).append(", group=")
				.append(group).append(", length=").append(length).append(", modificationTime=").append(modificationTime)
				.append(", owner=").append(owner).append(", pathSuffix=").append(pathSuffix).append(", permission=")
				.append(permission).append(", replication=").append(replication).append(", storagePolicy=")
				.append(storagePolicy).append(", type=").append(type).append("]");
		return builder.toString();
	}
}
