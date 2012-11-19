Numbering Scheme
================
<major>.<minor>.<patch>-<deliverable>_<build number>

Where "<milestone>_<build_number>" is sorted alphabetically, so we need padding:

M01_0099 < M01_0100 => 4 digits for build number gives up to 9999 builds
M09_42 < M10_87 => 2 digits for milestone version or RC version gives
up to 99 of those

Examples in ascending order:

1.2.3-M01_42
1.2.3-M01_43
1.2.3-M01_44
1.2.3-M01
1.2.3-M02_48
1.2.3-M02_49
1.2.3-M02
1.2.3-RC01_51
1.2.3-RC01_52
1.2.3-RC01
1.2.3-RC02_54
1.2.3-RC02
1.2.3
1.2.4-M01_65
...

This is like semver.org but simpler as Maven doesn't play nice.